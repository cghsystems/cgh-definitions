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

    /** <b>NOTE</b> id must be first property for @TupleConstructor reasons */
    String id, name, definition, description
    Long definitionCategoryId

    static Definition buildWithId(id) {
        final d = new Definition()
        d.id = id
        d
    }

}