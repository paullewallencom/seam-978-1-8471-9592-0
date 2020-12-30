<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://jboss.com/products/seam/taglib" prefix="s" %>

<html>
    <head>
        <title>Vacation</title>
    </head>
    <body>
        <f:view>
		<h:form>
			<p>What type of holiday do you like?</p>
			<h:selectOneMenu value="#{destination.destinationType}">
				<s:selectItems value="#{destinationTypes}" var="type"
					label="#{type.label}" noSelectionLabel="Please select" />
				<s:convertEnum />
			</h:selectOneMenu>

			<p>What is your minimum budget?</p>
			<h:inputText value="#{destination.minimumBudget}" />
			<br/>
			<h:commandButton action="#{vacationManagerAction.selectVacationType}"
				value="Select>" />
		</h:form>        </f:view>
    </body>
    
</html>