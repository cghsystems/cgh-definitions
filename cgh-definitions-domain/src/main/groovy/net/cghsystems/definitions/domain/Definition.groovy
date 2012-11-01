package net.cghsystems.definitions.domain

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor

/**
 * The domain class that contain all of the properties required for a definition.
 * 
 * @author chris
 *
 */
@ToString
@EqualsAndHashCode
@TupleConstructor
class Definition {

    /** Empty implementation to enforce the null object pattern */
    static Definition EMPTY_DEFINITION = new Definition(name: "Empty", definition: "Empty", description: "Empty")

    String id, name, definition, description
    Long definitionCategoryId
}