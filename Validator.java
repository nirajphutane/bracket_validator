package com.npgroup.bracket_validator;

import java.util.Stack;

public class Validator {
    
    public static void main(String[] args){
        Validator validator = new Validator();
        validator.validate();
    }
    
    private void validate(){
        String[] inputs = {
                "(){}[]",
                "{[()]}",
                "{[]}{()}",
                "{[]}{()}",    
                "{}{}{[{[{[((()))]}]}]}(",
                "{}{}{[{[{[((()))]}]}]})",
                "{}{}{[({[{[((()))]}]}]}(",
                "(){({}[]",                   
                "([{}(]()))",
                "{}{}{[{[{[((()))]}]}]}",
        };


        BracketValidator bracketValidator = new BracketValidator();
        for(String input: inputs){
            boolean isValidate = bracketValidator.isValidate(input);
            System.out.println(input.replaceAll(".(?=.)", "$0  ")+"	:---> "+(isValidate? "Valid": "Invalid")+"\n\n");
        }
    }
    
    private class BracketValidator{
        
        private boolean isValidate(String input) {
            
            input = input.replace(" ","");

            char[] brackets = input.toCharArray();

            Stack<Character> tempBracketStack = new Stack<>();

            for(int n = 0; n < brackets.length; n++){
                char bracket = brackets[n];
                /*System.out.println("Current:- "+bracket);*/

                if (bracket == '(' || bracket == '{' || bracket == '['){
                    tempBracketStack.push(bracket);
                }

                if(bracket == ')' || bracket == '}' || bracket == ']'){
                    /*System.out.println("ClosingBracket:- "+bracket);*/
                    try {
                        char oppositeBracket = OppositeBracket(bracket);
                        char top = tempBracketStack.peek();

                        /*System.out.println("Opposite:- "+oppositeBracket+"  "+"top:- "+top);*/

                        if(top == oppositeBracket){
                            tempBracketStack.pop();
                        }else {
                            return false;
                        }
                    }catch (Exception E){
                        return false;
                    }
                }
            }

            if(!tempBracketStack.empty()){
                return false;
            }

           return true;
        }

        private char OppositeBracket(char bracket){
            if(bracket == ')'){
                return '(';
            } else if(bracket == '}'){
                return '{';
            } else if(bracket == ']'){
                return '[';
            }
            return 0;
        }
    }
}