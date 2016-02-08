/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sliding.puzzle;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author kmhasan
 */
public class SlidingPuzzle {
    State initialState;
    State goalState;
    
    public SlidingPuzzle(int initialBoard[][], int goalBoard[][]) {
        initialState = new State(initialBoard);
        goalState = new State(goalBoard);
        
        System.out.println("Initial state\n" + initialState);
        System.out.println("Goal state\n" + goalState);
    }

    public boolean isGoal(State state) {
        return state.equals(goalState);
    }

    public void doBFS() {
        boolean goalReached = false;
        boolean isExplored[] = new boolean[987654322];
        
        Queue<State> queue = new LinkedList<>();
        queue.add(initialState);
        isExplored[initialState.map()] = true;
        State finalState = null;
        
        while (!queue.isEmpty() && !goalReached) {
            State currentState = queue.poll();
            if (currentState == null)
                break;
            
            for (Action action: Action.values()) {
                State nextState = currentState.nextState(action);
                if (nextState == null)
                    continue;
                if (isGoal(nextState)) {
                    goalReached = true;
                    finalState = nextState;
                    break;
                }
                int map = nextState.map();
                if (!isExplored[map]) {
                    queue.add(nextState);
                    isExplored[map] = true;
                }
            }
        }
        
        if (goalReached) {
            System.out.println("Solution found");
            printPath(finalState);
        } else {
            System.out.println("No solution found");
        }
    }
    
    public void printPath(State state) {
        if (state != null) {
            printPath(state.getParent());
            System.out.println(state);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int initialBoard[][] = {{1, 9, 3}, {4, 2, 6}, {7, 5, 8}};
//        int initialBoard[][] = {{8, 6, 7}, {2, 5, 4}, {3, 9, 1}}; // takes 31 steps
        int initialBoard[][] = {{8, 1, 2}, {9, 4, 3}, {7, 6, 5}}; // unsolvable
        int goalBoard[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        SlidingPuzzle instance = new SlidingPuzzle(initialBoard, goalBoard);
        instance.doBFS();
    }
    
}
