package Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ConvertorAbstractToConcrete.class,
				ConvertorConcreteToAbstract.class,
				ShapeBoxPolygonDimensions.class,
				ShapeBoxPolygonContains.class})
public class AllTests {
}
