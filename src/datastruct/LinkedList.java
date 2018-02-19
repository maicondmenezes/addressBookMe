/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastruct;

import addresbookme.*;

/**
 *
 * @author MaJoy
 */
public interface LinkedList {

    public abstract void include(Person data);

    public abstract Person delete(int index);

    public abstract int search(String value);
}
