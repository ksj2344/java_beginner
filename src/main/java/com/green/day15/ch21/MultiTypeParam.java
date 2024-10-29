package com.green.day15.ch21;

public class MultiTypeParam {
    public static void main(String[] args) {
        /*
            DBox<String, Integer> {
                private String left;
                private Integer right;
            void setter(String left, Integer right){ /
                this.left=left;
                this.right=right;
                }
            }

            box 객체는 이걸 객체화 하는 것과 같다.
            꺾쇠 안에서 지정한 타입이 바뀌면 또 그것으로 바뀐다. primitive 타입만 아니면 뭐든 가능.
         */

        DBox<String,Integer> box=new DBox<>(); //객체화 단계에서 멤버필드 타입지정
        box.setter("Apple",25);
        //box.setter("Apple","25");  //호출 타입이 맞지 않음
        System.out.println(box);

    }
}

class DBox<L,R>{
    private L left;
    private R right;

    void setter(L left, R right){ //원래 setter은 나눠서 해야함
        this.left=left;
        this.right=right;
    }
    @Override
    public String toString(){
        return String.format("%s & %s",left,right);
    }
}
