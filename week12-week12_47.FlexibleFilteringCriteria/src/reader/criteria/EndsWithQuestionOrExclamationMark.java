/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Christopher
 */
public class EndsWithQuestionOrExclamationMark implements Criterion {

 

    @Override
    public boolean complies(String line) {
        if(line.isEmpty()){
            return false;
        }
       char[] chars =  line.toCharArray();
       
       if(chars[chars.length-1]=='?'||chars[chars.length-1]=='!'){
           return true;
       }else{
           return false;
       }
      
    }

}
