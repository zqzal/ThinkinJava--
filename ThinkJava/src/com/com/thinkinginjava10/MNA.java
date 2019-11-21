package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/21.
 */
public class MNA {
    private void f(){

    }

    class A{
        private void g(){

        }

        public class B{
            void h(){
              g();
              f();
            }
        }
    }
}
