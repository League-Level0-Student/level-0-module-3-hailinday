package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
String horoscope = JOptionPane.showInputDialog("What is your star sign?");
if (horoscope.equalsIgnoreCase("Aries")) {
JOptionPane.showMessageDialog(null, "You are a goat");
} else if (horoscope.equalsIgnoreCase("Taurus")) {
JOptionPane.showMessageDialog(null, "You are a bull");
} else if (horoscope.equalsIgnoreCase("Gemini")) {
JOptionPane.showMessageDialog(null, "You are a baby");
} else if (horoscope.equalsIgnoreCase("Cancer")) {
JOptionPane.showMessageDialog(null, "You are a lobster");
} else if (horoscope.equalsIgnoreCase("Leo")) {
JOptionPane.showMessageDialog(null, "You are a lion");
} else if (horoscope.equalsIgnoreCase("Virgo")) {
JOptionPane.showMessageDialog(null, "You are a women");
} else if (horoscope.equalsIgnoreCase("Libra")) {
JOptionPane.showMessageDialog(null, "You are a weight");
} else if (horoscope.equalsIgnoreCase("Scorpio")) {
JOptionPane.showMessageDialog(null, "You are a scorpion");
} else if (horoscope.equalsIgnoreCase("Saggitarius")) {
JOptionPane.showMessageDialog(null, "You are an archer");
} else if (horoscope.equalsIgnoreCase("Capricorn")) {
JOptionPane.showMessageDialog(null, "You are also a goat");
} else if (horoscope.equalsIgnoreCase("Aquarius")) {
JOptionPane.showMessageDialog(null, "You are seafood");
} else if (horoscope.equalsIgnoreCase("Pisces")) {
JOptionPane.showMessageDialog(null, "You are a dolphin");	
} else {
JOptionPane.showMessageDialog(null, "That is not a horoscope");	
}



}
}
