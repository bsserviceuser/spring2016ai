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
public class HillClimbingNQueenSolver extends NQueenSolver {

    private void randomize(int positions[]) {
        for (int c = 0; c < positions.length; c++) {
            // Math.random() returns a value in the range [0, 1)
            int d = (int) (Math.random() * positions.length);
            int temp = positions[c];
            positions[c] = positions[d];
            positions[d] = temp;
        }
    }

    private int countConflicts(int positions[]) {
        int conflicts = 0;
        for (int currentColumn = 0; currentColumn < positions.length; currentColumn++) {
            for (int previousColumn = 0; previousColumn < currentColumn; previousColumn++) {
                int dx = currentColumn - previousColumn;
                int dy = Math.abs(positions[currentColumn] - positions[previousColumn]);
                if (dy == 0 || dy == dx) {
                    conflicts++;
                }
            }
        }
        return conflicts;
    }

    @Override
    public int[] getSolution(int n) {
        int positions[] = new int[n];
        int bestPositions[] = new int[n];

        for (int i = 0; i < positions.length; i++) {
            positions[i] = i;
        }
        randomize(positions);
        System.out.printf("Initial Solution: %s\nConflicts: %d\n", Arrays.toString(positions), countConflicts(positions));

        for (int tries = 0; tries < 1000; tries++) {
            System.arraycopy(positions, 0, bestPositions, 0, positions.length);
            int minConflicts = countConflicts(positions);
            int tempPositions[] = new int[n];

            for (int r = 0; r < positions.length; r++) {
                for (int c = 0; c < positions.length; c++) {
                    System.arraycopy(positions, 0, tempPositions, 0, positions.length);
                    tempPositions[c] = r;
                    int tempConflicts = countConflicts(tempPositions);
                    if (tempConflicts < minConflicts) {
                        minConflicts = tempConflicts;
                        System.arraycopy(tempPositions, 0, bestPositions, 0, positions.length);
                    }
                }
            }
            if (countConflicts(positions) > countConflicts(bestPositions)) {
                System.arraycopy(bestPositions, 0, positions, 0, n);
            } else {
                randomize(positions);
            }
        }
        System.out.printf("Updated Solution: %s\nConflicts: %d\n", Arrays.toString(bestPositions), countConflicts(bestPositions));
        return null;
    }

}
