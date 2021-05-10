package com;

public class CeilingFan {
    private int cordOne;
    private boolean cordTwo;

    public CeilingFan() {
        cordOne =0;
        cordTwo = true;
    }

    public int getCordOne() {
        return cordOne;
    }

    public boolean isCordTwo() {
        return cordTwo;
    }

    public int pullCordOne(boolean cordTwo){
        if(cordTwo)
            if(cordOne !=3)
                cordOne++;
            else
                cordOne=0;
        else
            if(cordOne !=0)
                cordOne--;
        return cordOne;
    }

    public boolean pullCordTwo(){
        cordTwo = !cordTwo;
        return cordTwo;
    }
}
