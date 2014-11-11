rm -rf ccallee

javac -sourcepath . -d . \
src/graph/Node.java \
src/graph/List.java \
src/graph/argumentList.java \
src/graph/Variable.java \
src/graph/Function.java \
src/graph/graphNode.java \
src/graph/IGraph.java \
src/graph/functionGraph.java \
src/graph/testList.java \
src/graph/testArgumentList.java \
src/graph/testVariable.java \
src/graph/testFunction.java \
src/graph/testGraphNode.java \
src/graph/testFunctionGraph.java

javac -sourcepath . -d . \
src/parser/Stack.java \
src/parser/testStack.java

java org.junit.runner.JUnitCore \
ccallee.graph.testVariable \
ccallee.graph.testList \
ccallee.graph.testArgumentList \
ccallee.graph.testFunction \
ccallee.graph.testGraphNode \
ccallee.graph.testFunctionGraph \
ccallee.parser.testStack
