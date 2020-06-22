package com.itheima.state;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.state.StartState
 ****/
public class StartState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
