
SUMMARY = "An extension module for click to enable registering CLI commands via setuptools entry-points."
HOMEPAGE = "https://github.com/click-contrib/click-plugins"
AUTHOR = "Kevin Wurster, Sean Gillies <wursterk@gmail.com, sean.gillies@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d512f1f7204a358a9323ae899c988eba"

SRC_URI = "https://files.pythonhosted.org/packages/5f/1d/45434f64ed749540af821fd7e42b8e4d23ac04b1eda7c26613288d6cd8a8/click-plugins-1.1.1.tar.gz"
SRC_URI[md5sum] = "969268b5b005b2b56115c66c55013252"
SRC_URI[sha256sum] = "46ab999744a9d831159c3411bb0c79346d94a444df9a3a3742e9ed63645f264b"

S = "${WORKDIR}/click-plugins-1.1.1"

RDEPENDS_${PN} = "python3-click"

inherit setuptools3
