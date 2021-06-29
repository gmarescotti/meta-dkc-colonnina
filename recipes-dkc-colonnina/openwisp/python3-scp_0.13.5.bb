
SUMMARY = "scp module for paramiko"
HOMEPAGE = "https://github.com/jbardin/scp.py"
AUTHOR = "James Bardin <j.bardin@gmail.com>"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=fc264c65fb17b7db5237cf7ce1780769"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/d2/35/392dde4dc4a1cb48f90fc7137104ac3246654c73aafd81efde5bd0078b12/scp-0.13.5.tar.gz"
SRC_URI[md5sum] = "f6d327bcaea6568c97dbe1ced8e6799e"
SRC_URI[sha256sum] = "0ab2ee9178b8be53dc5c9fe2f33761e01a2435087f5c9fb5b54519873c650d60"

S = "${WORKDIR}/scp-0.13.5"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
