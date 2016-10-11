/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

import java.util.ArrayList;

/**
 *
 * @author x14110784
 */
//This is the super class for BFlash(Used for biology class) and MFlash(which is unused)
public class Flash {

    //create Array and create variables 

    protected ArrayList<String> info;
    protected String inf;
    int count;

    public void setArray() {
        //declare and populate array
        info = new ArrayList<String>() {
            {
                add("Matter and force are the two fundamental entities of which the universe is composed. All that exists can be classified in these terms. All environmental phenomena occur because of the interactions between matter and transformations of matter in space and time. As the arrangements between forces and masses change, the change is manifested in terms of energy.");
                add("Bohr's theory, which resulted from his explaining the line spectrum of hydrogen, is that electrons can only revolve around atoms in certain allowed orbits or energy levels. When energy is given to an atom, electrons can move to higher energy levels, and when they return to their lower levels, energy is given out in the form of radiation - light, ultraviolet or infrared. This is the origin of the various lines in the spectra of the different elements.");
                add("An orbital, the modern equivalent of a Bohr's shell, is defined as the region around the nucleus of an atom where the electrons are most likely to be found. There is an orbital characteristic of each of the sub-energy levels, so the four types of orbital are s, p, d and f. Two more rules summarise how electrons fill the orbitals; these are Pauli's exclusion principle and Hund's rule of maximum multiplicity. It is necessary to know both these rules and how to apply them.");
                add("Two of the main types of chemical reactions are acid-base reactions, and redox reactions. Both of these involve the transfer of fundamental particles from one substance to the other. A knowledge of what each type of reaction involves is important to the understanding of many other aspects of chemistry. The other main type of chemical reaction is ion exchange, which is the type of reaction involved in the standard tests for the anions.");
                add("It is important to know the rules for calculating oxidation numbers and how oxidation numbers are used to balance redox equations. The rules will be found in any of the standard Leaving Certificate chemistry textbooks.");

            }
        };

    }

    public ArrayList<String> getInfo() {
        return info;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void ItterateArray() {
        if (count <= 4 && count >= 0) {
            inf = info.get(count);

        }

    }

    public String getInf() {
        return inf;
    }
}
