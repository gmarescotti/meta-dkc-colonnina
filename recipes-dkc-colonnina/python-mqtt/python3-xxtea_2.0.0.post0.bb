
SUMMARY = "xxtea is a simple block cipher"
HOMEPAGE = "https://github.com/ifduyue/xxtea"
AUTHOR = "Yue Du <ifduyue@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3a9dab7f159514231249aa3e108ab26b"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/7d/f2/09a9256819d920e104fbf45bb105433bd6f4f0ba8703c027aaeb03c8b0df/xxtea-2.0.0.post0.tar.gz"
SRC_URI[md5sum] = "9c359ab459b09ff779c74e9f79ee6284"
SRC_URI[sha256sum] = "f3463a9c7fb3458514a85128014a83861546817e3c52f8cc0102f6538f575cd6"

S = "${WORKDIR}/xxtea-2.0.0.post0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
