package AssigmentQuestions.NodeQ;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

public class Node {
     Node left ;
     Node right ;
     Integer data ;

     @NoArgsConstructor
     @RequiredArgsConstructor
     Node(){
          right = null;
          left = null;
     }
}
