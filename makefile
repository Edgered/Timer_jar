JFLAGS = -g
JC = javac
DIR = src
JVM = java

.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
				$(DIR)/Main.java \
        $(DIR)/TimerAlpha.java

MAIN = Main

default: classes

classes: $(CLASSES:.java=.class)

run: $(MAIN).class
	$(JVM) $(MAIN)

clean:
	$(RM) $(DIR)/*.class
