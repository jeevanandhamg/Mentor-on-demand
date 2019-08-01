$(document).ready(function(){
    $("#showpass").click(function(){
  
  
  
      $("#inputPassword").attr("type", function(i, origValue){
  
  
      var o=origValue;
  
    if(o=="text")
    {
    return "password"; 
    }
     return "text";
      });
    }); 
    $("#showpass2").click(function(){
  
  
  
  $("#inputPassword2").attr("type", function(i, origValue){


  var o=origValue;

if(o=="text")
{
return "password"; 
}
 return "text";
  });

  
  
}); 
  });