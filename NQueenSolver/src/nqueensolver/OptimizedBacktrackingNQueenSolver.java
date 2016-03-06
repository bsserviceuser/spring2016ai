/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nqueensolver;

/**
 *
 * @author kmhasan
 */
public class OptimizedBacktrackingNQueenSolver extends NQueenSolver {
    private boolean solutionFound;
    private boolean rowTaken[];
    private boolean diagonalTaken[];
    private boolean inverseDiagonalTaken[];
    
    @Override
    public int[] getSolution(int n) {
        int positions[] = new int[n];
        
        solutionFound = false;
        rowTaken = new boolean[n];
        diagonalTaken = new boolean[n * 2 + 1];
        inverseDiagonalTaken = new boolean[n * 2 + 1];
        backtrack(positions, 0);
        
        for (int i = 0; i < positions.length; i++)
            positions[i]++;
        
        if (solutionFound)
            return positions;
        else return null;
    }
    
    public void backtrack(int positions[], int currentColumn) {
        if (currentColumn >= positions.length) {
            solutionFound = true;
            return;
        }
        
        if (solutionFound)
            return;
        
        for (int currentRow = 0; currentRow < positions.length && !solutionFound; currentRow++) {
            int diagonalNumber = currentColumn - currentRow + positions.length - 1;
            int inverseDiagonalNumber = (positions.length - 1 - currentColumn) - currentRow + positions.length - 1;
            
            if (rowTaken[currentRow]) continue;
            if (diagonalTaken[diagonalNumber]) continue;
            if (inverseDiagonalTaken[inverseDiagonalNumber]) continue;
            
            rowTaken[currentRow] = true;
            diagonalTaken[diagonalNumber] = true;
            inverseDiagonalTaken[inverseDiagonalNumber] = true;

            positions[currentColumn] = currentRow;
            backtrack(positions, currentColumn + 1);

            rowTaken[currentRow] = false;
            diagonalTaken[diagonalNumber] = false;
            inverseDiagonalTaken[inverseDiagonalNumber] = false;
        }
    }
    
}
