package jp.ac.uryukyu.ie.ex3.pair13;

    public class ExDice extends Dice{
    private int minvalue;
    private int maxvalue;
	public ExDice(int minValue,int maxValue){
	this.minvalue = minValue;
	this.maxvalue = maxValue;
	play();
	}
	//@override
	public void play(){
        setValue((int)(Math.random() * (maxvalue-minvalue+1)) + minvalue);
}

}
