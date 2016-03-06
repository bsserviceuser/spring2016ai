/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nqueensolver;

import java.util.Arrays;

/**
 *
 * @author kmhasan
 */
public class NQueenSolverMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 50;
        NQueenSolver solver = new OptimizedBacktrackingNQueenSolver();
        long startTime = System.currentTimeMillis();
        int solution[] = solver.getSolution(n);
        long stopTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(solution));
        System.out.printf("Time taken: %.3f seconds\n", (stopTime - startTime) / 1000.0);

        solver = new UnoptimizedBacktrackingNQueenSolver();
        startTime = System.currentTimeMillis();
        solution = solver.getSolution(n);
        stopTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(solution));
        System.out.printf("Time taken: %.3f seconds\n", (stopTime - startTime) / 1000.0);
    }
}
