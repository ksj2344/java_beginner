package com.green.personal;



class test {
    public int solution(int[] dot) {
        int answer = 1; //몇분면이냐는 의미
        if(dot[1]>0&&dot[2]>0){answer=1;}
        else if(dot[1]>0&&dot[2]<0){answer=4;}
        else if(dot[1]<0&&dot[2]<0){answer=3;}
        else if(dot[1]<0&&dot[2]>0){answer=2;}
        return answer;
    }
}
