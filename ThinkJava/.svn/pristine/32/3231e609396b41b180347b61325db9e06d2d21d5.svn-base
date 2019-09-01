package com.com.thinkingjava7;

/**
 * Created by xuxi on 2019/2/26.
 */

import com.com.thinkinginjava6.access.dessert.Dinner;

/**
 * 3.final类
 * 当将某个类的整体定义为final时（通过将关键字final置于它的定义之前），就表明了你不打算
 * 继承该类，而且也不允许别人这样做。换据换说，出于某种考虑，你对该类的设计永不需要做任何
 * 变动，或者出于安全的考虑，你不希望它有子类。
 */

//Marking an entire class final.
class SmallBrain{

}
final class Dinosaur{
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f(){

    }
}
//! class Further extends Dinosaur{}
// error: Cannot extend final class 'Dinosaur'
public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}
/**
 *  请注意，final类的域可以根据个人的意愿选择为是或不是final。不论类是否被定义为final，
 *  相同的规则都适用于定义final的域。然而，由于final类禁止继承，所以final类中所有的方法
 *  都隐式指定为是final的，因为无法覆盖它们。在final类中可以给方法添加final修饰词，但这
 *  不会增添任何意义。
 */
/**
 * 有关final的忠告
 * 在设计类时，将方法指明是final的，应该说是明智的。你可能会觉得，没人会想要覆盖你的方法。
 * 有时这样是对的。
 * 但请留意你所作的假设。要预见类是如何被复用的一般是很困难的，，特别是对于一个通用类而言
 * 更是如此。如果将一个方法指定为final，可能会妨碍其他程序员在项目中通过继承来复用你的类，
 * 而这只是因为你没有想到它会以那种方式被运用。
 * Java标准程序库就是一个很好的例子。特别是Java 1.0/1.1中Vector类被广泛地运用，而且从
 * 效率考虑（这近乎是一个幻想），如果所有的方法均未被指定为final的话，它可能会更加有用。很
 * 容易想象到，人们可能会想要继承并覆盖如此基础而有用的类，但是设计者却认为这样做不太适合。
 * 这里有两个令人意外的原因。第一，Stack继承自Vector，就是说Stack是个Vector，这从逻辑
 * 的观点看是不太正确的。尽管如此，Java的设计者们自己仍旧继承了Vector。在以这种方式创建
 * Stack时，他们应该意思到final方法显得过于严苛了。
 * 第二，Vector的许多最重要的方法-如addElement()和elementAt()是同步的。正如在第21章
 * 中将要看到的那样，这将导致很大的执行开销，可能会抹煞final所带来的好处。这种情况增强了
 * 人们关于程序员无法正确猜测优化应当发生于何处的观点。如此别别蹩脚的设计，却要置于我们
 * 每个人都得适用的标准程序库中，这是很糟糕的（幸运的是，现代Java的容器库用ArrayList替代了
 * Vector。ArrayList的行为要合理得多。遗憾的是仍然存在旧容器库编写新程序代码的情况）。
 * 留心一下Hashtable，这个例子同样有趣，它也是一个重要的Java1.0/1.1标准库类，而且不含任何
 * final方法。如本书其他地方所提到的，某些类明显是由一些互不相关的人设计的（读者会发现，名为
 * Hashtable的方法相对于Vector中的方法要简洁得多，这又是一个证据）。对于类库的使用者来说，
 * 这又是一个本不该如此轻率的事物。这种不规则的情况只能使用户付出更多的努力。这是对粗糙的设计
 * 和代码的又一讽刺（请注意，现代Java的容器库用HashMap替代了Hashtable）。
 *
 */