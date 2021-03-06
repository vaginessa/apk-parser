/*
 * Copyright (c) 2009-2010 Panxiaobo
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pxb.android.dex2jar;

/**
 * @author Panxiaobo [pxb1988@126.com]
 * @version $Id$
 */
public interface Dex {
    /**
     * 
     * 获取类型
     * 
     * @param id
     *            编号
     * @return
     */
    public String getType(int id);

    /**
     * 获取字符串
     * 
     * @param id
     *            字编号
     * @return
     */
    public String getString(int id);

    /**
     * 获取方法的参数及其返回值
     * 
     * @param id
     *            编号
     * @return
     */
    public Proto getProto(int id);

    /**
     * 获取方法
     * 
     * @param id
     *            编号
     * @return
     */
    public Method getMethod(int id);

    /**
     * 获取成员
     * 
     * @param id
     *            编号
     * @return
     */
    public Field getField(int id);
}
