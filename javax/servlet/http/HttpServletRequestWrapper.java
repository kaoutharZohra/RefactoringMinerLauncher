/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
<<<<<<< HEAD
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
=======
 * Copyright (c) 1997-2013 Oracle and/or its affiliates. All rights reserved.
>>>>>>> bb70d17 ( v2)
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 *
 *
 * This file incorporates work covered by the following copyright and
 * permission notice:
 *
 * Copyright 2004 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package javax.servlet.http;

import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.ServletRequestWrapper;

/**
 * Provides a convenient implementation of the HttpServletRequest interface
 * that can be subclassed by developers wishing to adapt the request to a
 * Servlet.
 *
 * <p>This class implements the Wrapper or Decorator pattern. Methods default
 * to calling through to the wrapped request object.
 * 
 * @see javax.servlet.http.HttpServletRequest
 * @since Servlet 2.3
 */


public class HttpServletRequestWrapper extends ServletRequestWrapper implements HttpServletRequest {

<<<<<<< HEAD
	/** 
	* Constructs a request object wrapping the given request.
	* @throws java.lang.IllegalArgumentException if the request is null
	*/
    public HttpServletRequestWrapper(HttpServletRequest request) {
	    super(request);
    }
    
    private HttpServletRequest _getHttpServletRequest() {
	return (HttpServletRequest) super.getRequest();
=======
    /** 
     * Constructs a request object wrapping the given request.
     * @throws java.lang.IllegalArgumentException if the request is null
     */
    public HttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
    }
    
    private HttpServletRequest _getHttpServletRequest() {
        return (HttpServletRequest) super.getRequest();
>>>>>>> bb70d17 ( v2)
    }

    /**
     * The default behavior of this method is to return getAuthType()
     * on the wrapped request object.
     */
<<<<<<< HEAD

    public String getAuthType() {
	return this._getHttpServletRequest().getAuthType();
=======
    @Override
    public String getAuthType() {
        return this._getHttpServletRequest().getAuthType();
>>>>>>> bb70d17 ( v2)
    }
   
    /**
     * The default behavior of this method is to return getCookies()
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public Cookie[] getCookies() {
	return this._getHttpServletRequest().getCookies();
=======
    @Override
    public Cookie[] getCookies() {
        return this._getHttpServletRequest().getCookies();
>>>>>>> bb70d17 ( v2)
    }

    /**
     * The default behavior of this method is to return getDateHeader(String name)
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public long getDateHeader(String name) {
	return this._getHttpServletRequest().getDateHeader(name);
    }
        	
=======
    @Override
    public long getDateHeader(String name) {
        return this._getHttpServletRequest().getDateHeader(name);
    }
                
>>>>>>> bb70d17 ( v2)
    /**
     * The default behavior of this method is to return getHeader(String name)
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public String getHeader(String name) {
	return this._getHttpServletRequest().getHeader(name);
=======
    @Override
    public String getHeader(String name) {
        return this._getHttpServletRequest().getHeader(name);
>>>>>>> bb70d17 ( v2)
    }
    
    /**
     * The default behavior of this method is to return getHeaders(String name)
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public Enumeration<String> getHeaders(String name) {
	return this._getHttpServletRequest().getHeaders(name);
=======
    @Override
    public Enumeration<String> getHeaders(String name) {
        return this._getHttpServletRequest().getHeaders(name);
>>>>>>> bb70d17 ( v2)
    }  

    /**
     * The default behavior of this method is to return getHeaderNames()
     * on the wrapped request object.
     */
<<<<<<< HEAD
  
    public Enumeration<String> getHeaderNames() {
	return this._getHttpServletRequest().getHeaderNames();
=======
    @Override
    public Enumeration<String> getHeaderNames() {
        return this._getHttpServletRequest().getHeaderNames();
>>>>>>> bb70d17 ( v2)
    }
    
    /**
     * The default behavior of this method is to return
     * getIntHeader(String name) on the wrapped request object.
     */
<<<<<<< HEAD

     public int getIntHeader(String name) {
	return this._getHttpServletRequest().getIntHeader(name);
=======
    @Override
     public int getIntHeader(String name) {
        return this._getHttpServletRequest().getIntHeader(name);
>>>>>>> bb70d17 ( v2)
    }
    
    /**
     * The default behavior of this method is to return getMethod()
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public String getMethod() {
	return this._getHttpServletRequest().getMethod();
=======
    @Override
    public String getMethod() {
        return this._getHttpServletRequest().getMethod();
>>>>>>> bb70d17 ( v2)
    }
    
    /**
     * The default behavior of this method is to return getPathInfo()
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public String getPathInfo() {
	return this._getHttpServletRequest().getPathInfo();
=======
    @Override
    public String getPathInfo() {
        return this._getHttpServletRequest().getPathInfo();
>>>>>>> bb70d17 ( v2)
    }

    /**
     * The default behavior of this method is to return getPathTranslated()
     * on the wrapped request object.
     */
<<<<<<< HEAD

     public String getPathTranslated() {
	return this._getHttpServletRequest().getPathTranslated();
=======
    @Override
    public String getPathTranslated() {
        return this._getHttpServletRequest().getPathTranslated();
>>>>>>> bb70d17 ( v2)
    }

    /**
     * The default behavior of this method is to return getContextPath()
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public String getContextPath() {
	return this._getHttpServletRequest().getContextPath();
=======
    @Override
    public String getContextPath() {
        return this._getHttpServletRequest().getContextPath();
>>>>>>> bb70d17 ( v2)
    }
    
    /**
     * The default behavior of this method is to return getQueryString()
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public String getQueryString() {
	return this._getHttpServletRequest().getQueryString();
=======
    @Override
    public String getQueryString() {
        return this._getHttpServletRequest().getQueryString();
>>>>>>> bb70d17 ( v2)
    }
    
    /**
     * The default behavior of this method is to return getRemoteUser()
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public String getRemoteUser() {
	return this._getHttpServletRequest().getRemoteUser();
    }
    
 
=======
    @Override
    public String getRemoteUser() {
        return this._getHttpServletRequest().getRemoteUser();
    }
    
>>>>>>> bb70d17 ( v2)
    /**
     * The default behavior of this method is to return isUserInRole(String role)
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public boolean isUserInRole(String role) {
	return this._getHttpServletRequest().isUserInRole(role);
    }
    
    
    
=======
    @Override
    public boolean isUserInRole(String role) {
        return this._getHttpServletRequest().isUserInRole(role);
    }
    
>>>>>>> bb70d17 ( v2)
    /**
     * The default behavior of this method is to return getUserPrincipal()
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public java.security.Principal getUserPrincipal() {
	return this._getHttpServletRequest().getUserPrincipal();
    }
    
   
=======
    @Override
    public java.security.Principal getUserPrincipal() {
        return this._getHttpServletRequest().getUserPrincipal();
    }
    
>>>>>>> bb70d17 ( v2)
    /**
     * The default behavior of this method is to return getRequestedSessionId()
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public String getRequestedSessionId() {
	return this._getHttpServletRequest().getRequestedSessionId();
=======
    @Override
    public String getRequestedSessionId() {
        return this._getHttpServletRequest().getRequestedSessionId();
>>>>>>> bb70d17 ( v2)
    }
    
    /**
     * The default behavior of this method is to return getRequestURI()
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public String getRequestURI() {
	return this._getHttpServletRequest().getRequestURI();
    }
	/**
     * The default behavior of this method is to return getRequestURL()
     * on the wrapped request object.
     */
    public StringBuffer getRequestURL() {
	return this._getHttpServletRequest().getRequestURL();
    }
	
    
=======
    @Override
    public String getRequestURI() {
        return this._getHttpServletRequest().getRequestURI();
    }

    /**
     * The default behavior of this method is to return getRequestURL()
     * on the wrapped request object.
     */
    @Override
    public StringBuffer getRequestURL() {
        return this._getHttpServletRequest().getRequestURL();
    }
        
>>>>>>> bb70d17 ( v2)
    /**
     * The default behavior of this method is to return getServletPath()
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public String getServletPath() {
	return this._getHttpServletRequest().getServletPath();
    }
    
    
=======
    @Override
    public String getServletPath() {
        return this._getHttpServletRequest().getServletPath();
    }
    
>>>>>>> bb70d17 ( v2)
    /**
     * The default behavior of this method is to return getSession(boolean create)
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public HttpSession getSession(boolean create) {
	return this._getHttpServletRequest().getSession(create);
=======
    @Override
    public HttpSession getSession(boolean create) {
        return this._getHttpServletRequest().getSession(create);
>>>>>>> bb70d17 ( v2)
    }
    
    /**
     * The default behavior of this method is to return getSession()
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public HttpSession getSession() {
	return this._getHttpServletRequest().getSession();
=======
    @Override
    public HttpSession getSession() {
        return this._getHttpServletRequest().getSession();
    }
    
    /**
     * The default behavior of this method is to return changeSessionId()
     * on the wrapped request object.
     *
     * @since Servlet 3.1
     */
    @Override
    public String changeSessionId() {
        return this._getHttpServletRequest().changeSessionId();
>>>>>>> bb70d17 ( v2)
    }
    
    /**
     * The default behavior of this method is to return isRequestedSessionIdValid()
     * on the wrapped request object.
     */ 
<<<<<<< HEAD

    public boolean isRequestedSessionIdValid() {
	return this._getHttpServletRequest().isRequestedSessionIdValid();
    }
     
    
=======
    @Override
    public boolean isRequestedSessionIdValid() {
        return this._getHttpServletRequest().isRequestedSessionIdValid();
    }
     
>>>>>>> bb70d17 ( v2)
    /**
     * The default behavior of this method is to return isRequestedSessionIdFromCookie()
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public boolean isRequestedSessionIdFromCookie() {
	return this._getHttpServletRequest().isRequestedSessionIdFromCookie();
    }
    

=======
    @Override
    public boolean isRequestedSessionIdFromCookie() {
        return this._getHttpServletRequest().isRequestedSessionIdFromCookie();
    }
    
>>>>>>> bb70d17 ( v2)
    /**
     * The default behavior of this method is to return isRequestedSessionIdFromURL()
     * on the wrapped request object.
     */ 
<<<<<<< HEAD
=======
    @Override
>>>>>>> bb70d17 ( v2)
    public boolean isRequestedSessionIdFromURL() {
        return this._getHttpServletRequest().isRequestedSessionIdFromURL();
    }

<<<<<<< HEAD
    
=======
>>>>>>> bb70d17 ( v2)
    /**
     * The default behavior of this method is to return isRequestedSessionIdFromUrl()
     * on the wrapped request object.
     */
<<<<<<< HEAD
    public boolean isRequestedSessionIdFromUrl() {
	return this._getHttpServletRequest().isRequestedSessionIdFromUrl();
    }


=======
    @Override
    public boolean isRequestedSessionIdFromUrl() {
        return this._getHttpServletRequest().isRequestedSessionIdFromUrl();
    }

>>>>>>> bb70d17 ( v2)
    /**
     * The default behavior of this method is to call authenticate on the
     * wrapped request object.
     *
     * @since Servlet 3.0
     */
<<<<<<< HEAD
=======
    @Override
>>>>>>> bb70d17 ( v2)
    public boolean authenticate(HttpServletResponse response)
            throws IOException, ServletException {
        return this._getHttpServletRequest().authenticate(response);
    }

<<<<<<< HEAD

=======
>>>>>>> bb70d17 ( v2)
    /**
     * The default behavior of this method is to call login on the wrapped
     * request object.
     *
     * @since Servlet 3.0
     */
<<<<<<< HEAD
=======
    @Override
>>>>>>> bb70d17 ( v2)
    public void login(String username, String password)
            throws ServletException {
        this._getHttpServletRequest().login(username,password);
    }

<<<<<<< HEAD

=======
>>>>>>> bb70d17 ( v2)
    /**
     * The default behavior of this method is to call login on the wrapped
     * request object.
     *
     * @since Servlet 3.0
     */
<<<<<<< HEAD
=======
    @Override
>>>>>>> bb70d17 ( v2)
    public void logout() throws ServletException {
        this._getHttpServletRequest().logout();
    }

    /**
     * The default behavior of this method is to call getParts on the wrapped
     * request object.
     *
     * <p>Any changes to the returned <code>Collection</code> must not 
     * affect this <code>HttpServletRequestWrapper</code>.
     *
     * @since Servlet 3.0
     */
<<<<<<< HEAD
=======
    @Override
>>>>>>> bb70d17 ( v2)
    public Collection<Part> getParts() throws IOException, ServletException {
        return this._getHttpServletRequest().getParts(); 
    }

    /**
     * The default behavior of this method is to call getPart on the wrapped
     * request object.
     *
     * @since Servlet 3.0
     */
<<<<<<< HEAD
=======
    @Override
>>>>>>> bb70d17 ( v2)
    public Part getPart(String name) throws IOException, ServletException {
        return this._getHttpServletRequest().getPart(name); 
    
    }

<<<<<<< HEAD
=======
    /**
     * Create an instance of <code>HttpUpgradeHandler</code> for an given
     * class and uses it for the http protocol upgrade processing.
     *
     * @since Servlet 3.1
     */
    @Override
    public <T extends HttpUpgradeHandler> T upgrade(Class<T> handlerClass)
            throws IOException, ServletException {
        return this._getHttpServletRequest().upgrade(handlerClass);
    }
>>>>>>> bb70d17 ( v2)
}
