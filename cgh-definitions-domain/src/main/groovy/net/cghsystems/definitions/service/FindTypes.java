package net.cghsystems.definitions.service;

/**
 * An enum to depict the type of find request that can be handled by the find service. This is inspired by the
 * Request API pattern and allows a single entry point in to the find service to deal with multiple types of request.
 * <p/>
 * For example  a generic find entry point can deal with FIND_ALL and FINB_BY_ID calls simple by changing the
 * 'find-type' header value. This allows us to define multiple API's without having to explicitly expose them via
 * the API.
 *
 * @author: chris
 * @date: 12/12/2012
 */
public enum FindTypes {

    FIND_ALL,

    FIND_BY_ID
}
