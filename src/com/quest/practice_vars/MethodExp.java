package com.quest.practice_vars;

public class MethodExp {

    public static void main(String[] args) {
MethodExp methodExp= new MethodExp();
methodExp.display("asdfg");
int sum=methodExp.add(5,6);
        System.out.println(sum);

    }

    /**
     *
     * @param str-name
     */
    private void display(String str){
        System.out.println(str);
    }

    /**
     *
     * @param a-operands
     * @param b-operands
     * @return -sum
     */
    private int add(int a, int b){
        return a+b;
    }
}
