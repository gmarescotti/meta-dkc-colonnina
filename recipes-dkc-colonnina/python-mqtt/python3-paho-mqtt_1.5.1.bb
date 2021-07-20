
SUMMARY = "MQTT version 5.0/3.1.1 client class"
HOMEPAGE = "http://eclipse.org/paho"
AUTHOR = "Roger Light <roger@atchoo.org>"
LICENSE = "Eclipse"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=eb48c6ee2cb9f5b8b9fe75e6f817bdfc"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/32/d3/6dcb8fd14746fcde6a556f932b5de8bea8fedcb85b3a092e0e986372c0e7/paho-mqtt-1.5.1.tar.gz"
SRC_URI[md5sum] = "32f93c0ed92c7439f7a715ed258fd35d"
SRC_URI[sha256sum] = "9feb068e822be7b3a116324e01fb6028eb1d66412bf98595ae72698965cb1cae"

S = "${WORKDIR}/paho-mqtt-1.5.1"

DEPENDS += " ${PYTHON_PN}-pytest-runner-native"
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
