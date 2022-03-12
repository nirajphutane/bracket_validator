# Bracket Validator

# Code Output:

(  )  {  }  [  ]	:---> Valid


{  [  (  )  ]  }	:---> Valid


{  [  ]  }  {  (  )  }	:---> Valid


{  [  ]  }  {  (  )  }	:---> Valid


{  }  {  }  {  [  {  [  {  [  (  (  (  )  )  )  ]  }  ]  }  ]  }  (	:---> Invalid


{  }  {  }  {  [  {  [  {  [  (  (  (  )  )  )  ]  }  ]  }  ]  }  )	:---> Invalid


{  }  {  }  {  [  (  {  [  {  [  (  (  (  )  )  )  ]  }  ]  }  ]  }  (	:---> Invalid


(  )  {  (  {  }  [  ]	:---> Invalid


(  [  {  }  (  ]  (  )  )  )	:---> Invalid


{  }  {  }  {  [  {  [  {  [  (  (  (  )  )  )  ]  }  ]  }  ]  }	:---> Valid

