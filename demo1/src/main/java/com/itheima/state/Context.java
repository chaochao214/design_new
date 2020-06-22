package com.itheima.state;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.state.Context
 ****/
public class Context {

    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
