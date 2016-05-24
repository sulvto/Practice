<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>        
    <title>My First chart using FusionCharts</title>    
    <script type="text/javascript" src="FusionCharts/FusionCharts.js">
    </script>
  </head>   
  <body>     
    <div id="chartContainer">FusionCharts will load here!</div>          
    <script type="text/javascript"><!--         

   function findChart(swf){
    	var myChart = new FusionCharts( "FusionCharts/"+swf+".swf", 
    		      "myChartId", "400", "300", "0", "1" );
    		      //myChart.setJSONUrl("purchaseBillItem_chart2.action?baseQuery.groupBy=o.bill.supplier.name");
    		      myChart.setJSONUrl("purchaseBillItem_chart2.action?${pageContext.request.queryString}");
    		      myChart.render("chartContainer");
    }
    findChart('Column3D');
    // -->     
    </script>  
    <input type="button" onclick="findChart(this.value);" value="Column3D"/>    
    <input type="button" onclick="findChart(this.value);" value="Column2D"/>
    <input type="button" onclick="findChart(this.value);" value="Pie3D"/>    
    <input type="button" onclick="findChart(this.value);" value="Pie2D"/>
    <input type="button" onclick="findChart(this.value);" value="Line"/>    
    <input type="button" onclick="findChart(this.value);" value="Pareto3D"/>
  </body> 
</html>