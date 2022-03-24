/*
 * 21/2/22
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 * 
 * Class to set up a player
 * 
 */

import java.util.HashSet;

public class Player {

 private String name;
 private int moneyLeft;
 private static int pos;
 private boolean isBroken;
 private HashSet<Property> properties;

 // Constructores

 // Default
 public Player() {
 this.name = "";
 }
 
 // Main Constructor
 public Player(String name, int moneyLeft, int pos, boolean isBroken) {
  this.name = name;
  this.moneyLeft = moneyLeft;
  this.pos = pos;
  this.isBroken = isBroken;
  this.properties = new HashSet<Property>();
 }

// Getters and Setters

 public String getName() {
  return this.name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getMoneyLeft() {
  return moneyLeft;
 }

 public void setMoneyLeft(int moneyLeft) {
  this.moneyLeft = moneyLeft;
 }

 public static int getPos() {
  return pos;
 }

 public static void setPos(int pos) {
  Player.pos = pos;
 }

 public boolean getIsBroken() {
  return isBroken;
 }

 public void setIsBroken(Boolean isBroken) {
  this.isBroken = isBroken;
 }

 public HashSet<Property> getProperties() {
  return properties;
 }

 public void setProperties(HashSet<Property> properties) {
  this.properties = properties;
 }

 // To String

 @Override
 public String toString() {
  return  "moneyLeft = " + moneyLeft +
          " - pos = " + pos +
          " - isBroken = " + isBroken
          ;
 }


 // MORE METHODS

 // Pay an amount of money

public void pay(int amount) {
  if (getMoneyLeft() > amount) {
   this.moneyLeft -= amount;
  } else {
   System.out.println("The player does not have enough money for this action");
  }
}

 // Receive an amount of money

 public void receive(int amount) {
  this.moneyLeft += amount;
 }


}