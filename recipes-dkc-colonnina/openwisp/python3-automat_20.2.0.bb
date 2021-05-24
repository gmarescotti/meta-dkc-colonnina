
SUMMARY = "Self-service finite-state machines for the programmer on the go."
HOMEPAGE = "https://github.com/glyph/Automat"
AUTHOR = "Glyph <glyph@twistedmatrix.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4ad213bcca81688e94593e5f60c87477"

SRC_URI = "https://files.pythonhosted.org/packages/80/c5/82c63bad570f4ef745cc5c2f0713c8eddcd07153b4bee7f72a8dc9f9384b/Automat-20.2.0.tar.gz"
SRC_URI[md5sum] = "d6cef9886b037b8857bfbc686f3ae30a"
SRC_URI[sha256sum] = "7979803c74610e11ef0c0d68a2942b152df52da55336e0c9d58daf1831cbdf33"

S = "${WORKDIR}/Automat-20.2.0"

RDEPENDS_${PN} = "python3-attrs python3-six"

inherit setuptools3
