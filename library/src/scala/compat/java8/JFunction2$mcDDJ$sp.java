
/*
 * Copyright (C) 2012-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package scala.compat.java8;

@FunctionalInterface
public interface JFunction2$mcDDJ$sp extends JFunction2 {
    abstract double apply$mcDDJ$sp(double v1, long v2);

    default Object apply(Object v1, Object v2) { return (Double) apply$mcDDJ$sp(scala.runtime.BoxesRunTime.unboxToDouble(v1), scala.runtime.BoxesRunTime.unboxToLong(v2)); }
}
