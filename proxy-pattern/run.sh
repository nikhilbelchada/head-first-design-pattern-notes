# first, start rmi registry
rmiregistry
# on second terminal run gumball machine
java GumballMachineTestDrive localhost 10
# on third terminal run gumball monitor which acts as proxy
java GumballMonitorTestDrive
