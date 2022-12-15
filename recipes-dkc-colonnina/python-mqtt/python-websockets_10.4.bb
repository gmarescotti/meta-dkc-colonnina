
SUMMARY = "An implementation of the WebSocket Protocol (RFC 6455 & 7692)"
HOMEPAGE = "https://github.com/aaugustin/websockets"
AUTHOR = " Aymeric Augustin "
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78c2cc91e172ca96d6f8e4a76c739ec6"

inherit setuptools3
SRC_URI = "https://files.pythonhosted.org/packages/85/dc/549a807a53c13fd4a8dac286f117a7a71260defea9ec0c05d6027f2ae273/websockets-10.4.tar.gz"
SRC_URI[md5sum] = "d6b1a2cb5e194ae43f849c125b71c8db"
SRC_URI[sha256sum] = "eef610b23933c54d5d921c92578ae5f89813438fded840c2e9809d378dc765d3"

S = "${WORKDIR}/websockets-10.4"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
