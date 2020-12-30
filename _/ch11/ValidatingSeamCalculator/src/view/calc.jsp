<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://jboss.com/products/seam/taglib" prefix="s" %>

<html>
   <head>
      <title>Seam Calculator</title>
      <link href="styles.css" rel="stylesheet" type="text/css" />
   </head>
   <body>
      <f:view>
         <h:form>
               <h:panelGrid columns="2">
               Value 1: 
               <s:decorate>
                    <f:facet name="aroundInvalidField">
                         <s:span styleClass="invalidInput"/>
                    </f:facet>
                    <f:facet name="beforeInvalidField">
                         <f:verbatim>**</f:verbatim>
                    </f:facet>
                    <f:facet name="afterInvalidField">
                         <s:message/>
                    </f:facet>
                    <h:inputText value="#{calculator.value1}" required="true" >
                         <s:validate/>
                    </h:inputText>
               </s:decorate>
                     
               Value 2: 
               <s:decorate>
                    <f:facet name="aroundInvalidField">
                         <s:span styleClass="invalidInput"/>
                    </f:facet>
                    <f:facet name="beforeInvalidField">
                         <f:verbatim>**</f:verbatim>
                    </f:facet>
                    <f:facet name="afterInvalidField">
                         <s:message/>
                    </f:facet>
                    <h:inputText value="#{calculator.value2}" required="true">
                         <s:validate/>
                    </h:inputText>
               </s:decorate>
                     

                     
                  Add them together gives: <h:outputText value="#{calculator.answer}"/>
               </h:panelGrid>
            <h:commandButton value="Add" action="#{calcAction.calculate}"/>
            <h:messages/>
         </h:form>
      </f:view>
   </body>

</html>