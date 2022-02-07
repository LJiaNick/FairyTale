package module;

public interface Creature {
  String getName();

  TypeOfLand getLandOfOrigin();

  int getInitialMagicStrength();

  Boolean canDrinkPotion();

  int drinkPotion();

}
