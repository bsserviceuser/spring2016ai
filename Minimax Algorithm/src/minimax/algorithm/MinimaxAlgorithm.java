/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimax.algorithm;

/**
 *
 * @author kmhasan
 */
public class MinimaxAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char initialBoard[][] = {
            {'X', '.', '.'},  
            {'.', 'O', 'X'},  
            {'.', 'O', '.'},  
        };
        State initialState = new State(initialBoard, 'X');
        System.out.println(initialState);
        System.out.println(initialState.getWinner());
        
        State nextState = initialState.getNextState(0, 1);
        System.out.println(nextState);
    }
    
}
