
SUMMARY = "Interfaces for Python"
HOMEPAGE = "https://github.com/zopefoundation/zope.interface"
AUTHOR = "Zope Foundation and Contributors <zope-dev@zope.org>"
LICENSE = "ZPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=78ccb3640dc841e1baecb3e27a6966b2"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/ae/58/e0877f58daa69126a5fb325d6df92b20b77431cd281e189c5ec42b722f58/zope.interface-5.4.0.tar.gz"
SRC_URI[md5sum] = "c58b31da83449631efb499de13c68c6a"
SRC_URI[sha256sum] = "5dba5f530fec3f0988d83b78cc591b58c0b6eb8431a85edd1569a0539a8a5a0e"

S = "${WORKDIR}/zope.interface-5.4.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
