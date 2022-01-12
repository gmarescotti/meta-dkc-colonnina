
SUMMARY = "Human friendly output for text interfaces using Python"
HOMEPAGE = "https://humanfriendly.readthedocs.io"
AUTHOR = "Peter Odding <peter@peterodding.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5d178009f806c2bdd498a19be0013a7a"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/cc/3f/2c29224acb2e2df4d2046e4c73ee2662023c58ff5b113c4c1adac0886c43/humanfriendly-10.0.tar.gz"
SRC_URI[md5sum] = "79ae9293181aa113698ee3393f202188"
SRC_URI[sha256sum] = "6b0b831ce8f15f7300721aa49829fc4e83921a9a301cc7f606be6686a2288ddc"

S = "${WORKDIR}/humanfriendly-10.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
