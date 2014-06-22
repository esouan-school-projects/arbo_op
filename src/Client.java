import FlyWeight.FlyWeightExpression;
import FlyWeight.FlyWeightFactory;

/**
 * Created by kimsavinfo on 22/06/14.
 */
public class Client
{
    public static void main (String[] args)
    {
        System.out.println("==== DESIGN PATTERN ====");

        FlyWeightFactory factory = new FlyWeightFactory();

        FlyWeightExpression e1 = factory.construire('+', factory.construire('x'), factory.construire(2));
        FlyWeightExpression e2 = factory.construire('-', factory.construire(2), factory.construire('x'));
        FlyWeightExpression e3 = factory.construire('/', factory.construire(1), factory.construire(e2));
        FlyWeightExpression e = factory.construire('*', e1, e3);

        e.toString();
        e.evaluer(1);
    }
}
