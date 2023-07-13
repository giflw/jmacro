package com.itquasar.multiverse.jmacro.core.annotations

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Target

/**
 * Marks a method as not inherited behavior on subclasses as is meta programing subject or something else.
 * See groovy meta class custom methods.
 */
@Target(ElementType.METHOD)
@Documented
@interface NotInherited {

}
