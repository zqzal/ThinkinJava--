package com.com.thinkingjava9;

/**
 * Created by xuxi on 2019/11/12.
 */
public class HorrorShow {

    static void u(Monster b){
        b.menace();
    }

    static void v(DangerousMonster d){
        d.menace();
        d.destory();
    }

    static void w(Lethal l){
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);

        Vampire vlad = new VerBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
