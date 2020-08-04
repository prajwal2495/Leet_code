class Solution {
    public boolean judgeCircle(String moves) {

        int moves_U_D = 0, moves_L_R = 0;

        for (char direction : moves.toCharArray())
        {
            if(direction == 'U')
                moves_U_D++;
            if(direction == 'D')
                moves_U_D--;
            if(direction == 'R')
                moves_L_R++;
            if(direction == 'L')
                moves_L_R--;
        }
        return moves_U_D == 0 && moves_L_R == 0;
    }
}