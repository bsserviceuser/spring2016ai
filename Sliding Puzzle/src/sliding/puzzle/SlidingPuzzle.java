/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sliding.puzzle;

/**
 *
 * @author kmhasan
 */
public class SlidingPuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int board[][] = {{1, 2, 3}, {4, 5, 6}, {7, 9, 8}};
        State state = new State(board);
        System.out.println(state);
        
        for (Action action: Action.values()) {
            System.out.println(action);
            System.out.println(state.nextState(action));
        }
    }
    
}
