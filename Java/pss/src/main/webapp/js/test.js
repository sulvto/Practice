    $("tr").toggle(
      function () {
    	  
        $(this).css({"list-style-type":"disc", "color":"blue"});
      },
      function () {
        $(this).css({"list-style-type":"disc", "color":"red"});
      },
      function () {
        $(this).css({"list-style-type":", "color":"});
      }
    );