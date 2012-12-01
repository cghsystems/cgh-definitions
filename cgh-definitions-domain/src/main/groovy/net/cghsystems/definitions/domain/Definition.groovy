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
@TupleConstructor(excludes = "id")
class Definition {

    /** Empty implementation to enforce the null object pattern */
    static Definition EMPTY_DEFINITION = new Definition(name: "Empty", definition: "Empty", description: "Empty")

    /** <b>NOTE</b> id must be first property for @TupleConstructor reasons */
    String id, name, definition, description
    Long definitionCategoryId

    static Definition buildWithId(id) {
        final d = new Definition()
        d.id = id
        d
    }

}