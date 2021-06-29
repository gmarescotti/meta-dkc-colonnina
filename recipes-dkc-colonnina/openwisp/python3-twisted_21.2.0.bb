
SUMMARY = "An asynchronous networking framework written in Python"
HOMEPAGE = "https://twistedmatrix.com/"
AUTHOR = "Twisted Matrix Laboratories <twisted-python@twistedmatrix.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e33c411c0b86b1f3ca299091ed51ca31"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/c2/41/3f30da0f7025480eff8feb9ef0927c6db6bbbf6e64985cac77ee0210a903/Twisted-21.2.0.tar.gz"
SRC_URI[md5sum] = "0733e15bcc48bb2c8b4d593bb0839043"
SRC_URI[sha256sum] = "77544a8945cf69b98d2946689bbe0c75de7d145cdf11f391dd487eae8fc95a12"

S = "${WORKDIR}/Twisted-21.2.0"

DEPENDS += " "
RDEPENDS_${PN} = "python3-zope-interface python3-constantly python3-incremental python3-automat python3-hyperlink python3-attrs"

BBCLASSEXTEND = "native nativesdk"
