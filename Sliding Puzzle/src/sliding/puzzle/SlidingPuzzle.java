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
        System.out.println(isGoal(initialState));
    }

    public boolean isGoal(State state) {
        return state.equals(goalState);
    }

    public void doBFS() {
        Queue<State> queue = new LinkedList<>();
        queue.add(initialState);
        
        while (!queue.isEmpty()) {
            State currentState = queue.poll();
            if (currentState == null)
                break;
            
            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int initialBoard[][] = {{1, 9, 3}, {4, 2, 6}, {7, 5, 8}};
        int goalBoard[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        SlidingPuzzle instance = new SlidingPuzzle(initialBoard, goalBoard);
    }
    
}
