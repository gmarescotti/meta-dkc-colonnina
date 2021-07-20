
SUMMARY = "Idomatic asyncio wrapper around paho-mqtt."
HOMEPAGE = "https://github.com/sbtinstruments/asyncio-mqtt"
AUTHOR = "Frederik Aalund <fpa@sbtinstruments.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://setup.py;md5=6b80af8bcb11db443a7c47a3e9ab1fe5"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/6d/61/6cbfae477ed2034b9ae1b6d20dc848a47d327a53343d5e6db74d704a79b0/asyncio_mqtt-0.10.0.tar.gz"
SRC_URI[md5sum] = "cf95c68f83af5034b82243e828ed04a2"
SRC_URI[sha256sum] = "5f5f7abb9dbf11caefa7f63b0ca7270c02d39233b5c4792ff35fb900df6e2469"

S = "${WORKDIR}/asyncio_mqtt-0.10.0"

DEPENDS += " "
RDEPENDS_${PN} = "python3-paho-mqtt"

BBCLASSEXTEND = "native nativesdk"
