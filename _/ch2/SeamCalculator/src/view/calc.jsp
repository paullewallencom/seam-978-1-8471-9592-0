<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
   <head>
      <title>Seam Calculator</title>
   </head>
   <body>
      <f:view>
         <h:form>
               <h:panelGrid columns="2">
                  Value 1: <h:inputText value="#{calculator.value1}" />
                  Value 2: <h:inputText value="#{calculator.value2}" />
                  Add them together gives: <h:outputText value="#{calculator.answer}"/>
               </h:panelGrid>
            <h:commandButton value="Add" action="#{calcAction.calculate}"/>
         </h:form>
      </f:view>
   </body>

</html>